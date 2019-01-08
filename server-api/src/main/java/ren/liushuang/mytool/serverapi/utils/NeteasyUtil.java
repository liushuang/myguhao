package ren.liushuang.mytool.serverapi.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
}
