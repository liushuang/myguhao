package ren.liushuang.mytool.serverapi.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mashape.unirest.http.Unirest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NeteasyUtil {

    public static String getByUrl(String url) {
        String result = null;
        try {
            Process pcs = Runtime.getRuntime().exec("phantomjs /Users/admin/projects/wechat/myguhao/phantomjs/getByUrl.js " + url);

            BufferedInputStream in = new BufferedInputStream(pcs.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String lineStr;
            while ((lineStr = br.readLine()) != null) {
                result += lineStr;
            }
            // 关闭输入流
            br.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(result != null && result.indexOf("null")==0){
            result = result.substring("null".length());
            result = Lpc2JsUtil.convert(result);
        }
        return result;
    }

    public static String getEquipByUrl(String url) {

        try {
            String result = Unirest.get(url)
                                   .header("User-Agent",
                                           "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")
                                   .asString().getBody();
            int subStart = result.indexOf("(");
            if (subStart > 0 && subStart < 100) {
                result = result.substring(subStart+1, result.lastIndexOf(")"));
            }
            return result;
        } catch (Exception e) {
            log.error("getEquipByUrl error, url = " + url, e);
        }
        return null;
    }
}
