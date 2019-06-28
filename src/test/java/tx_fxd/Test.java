package tx_fxd;

import com.lnsoft.bd.fk.po.TXczyZylc;
import com.lnsoft.bd.fk.utils.HttpClientUtil;
import org.apache.http.Consts;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) throws IOException {

		Map<String,ContentBody> reqParam = new HashMap<String,ContentBody>();
		reqParam.put("fxid",new StringBody("zlskdejfdlaseefngoliewajbngr",ContentType.create("multipart/form-data", Consts.UTF_8)));
		reqParam.put("tpName",new StringBody("1.jpg",ContentType.create("multipart/form-data", Consts.UTF_8)));
		reqParam.put("wjms",new StringBody("已经确认啦......",ContentType.create("multipart/form-data", Consts.UTF_8)));
		reqParam.put("sj",new StringBody(new Date().toString(),ContentType.create("multipart/form-data", Consts.UTF_8)));
		//reqParam.put("sfdc",new StringBody(2"",ContentType.create("multipart/form-data", Consts.UTF_8)));
		reqParam.put("tp",new FileBody(new File("D://1.jpg"),ContentType.MULTIPART_FORM_DATA));
		HttpClientUtil.postFileMultiPart("Http://localhost:28080/fxd/uploadPictuire",reqParam);
		TXczyZylc tXczyZylc = new TXczyZylc();
		tXczyZylc.setObjId("2221221");
		tXczyZylc.setSfwc("");
	}
}
