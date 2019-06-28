package com.lnsoft.bd.fk.utils;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.PartSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

public class UploadUtils {

    private static final Logger logger = LoggerFactory.getLogger(UploadUtils.class);
    // private static final Logger logger = LoggerFactory.getLogger(this.getClass());

    public  static boolean upload(String filepath, String filepathTwo, final String fileName, final InputStream inputStream, final int i,String URL){
        boolean flag = false;
        try {
            final String fileNewName = URLEncoder.encode(fileName, "UTF-8");
            HttpClient httpC = new HttpClient();

            PostMethod filePost = new PostMethod(URL+"/"+filepath+"/"+filepathTwo);
            PartSource partSource = new PartSource() {
                public long getLength() {
                    return i;
                }

                public String getFileName() {
                    return fileNewName;
                }

                public InputStream createInputStream() throws IOException {
                    return inputStream;
                }
            };

            Part[] parts = {new FilePart("file", partSource)};
            filePost.setRequestEntity(new MultipartRequestEntity(parts, filePost.getParams()));
            httpC.getHttpConnectionManager().getParams().setConnectionTimeout(5000);

            int status = httpC.executeMethod(filePost);

            if(status==200){
                String resp = filePost.getResponseBodyAsString();
                flag = Boolean.parseBoolean(resp);
            }
            filePost.releaseConnection();
            logger.debug("上传成功,上传路径:"+filepath+"文件名:"+fileName);
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
            logger.debug("上传失败,上传路径:"+filepath+"文件名:"+fileName);
        }
        return false;
    }
}
