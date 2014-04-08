package co.uberdev.ultimateorganizer.core;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by oguzbilgener on 08/04/14.
 */
public class CoreCrypto
{
    public static String sha1(String msg)
    {
        MessageDigest md = null;
        try
        {
            md = MessageDigest.getInstance("SHA-1");
            md.reset();
            md.update(msg.getBytes("UTF-8"));
            return byteArrayToHexString(md.digest());
        }
        catch(NoSuchAlgorithmException e) {
            return null;
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static String hmacSha1(String data, String key)
    {
        try
        {
            SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), "HmacSHA1");
            Mac mac = Mac.getInstance( "HmacSHA1");
            mac.init(signingKey);
            return byteArrayToHexString(mac.doFinal(data.getBytes()));
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public static String byteArrayToHexString(byte[] b) {
        String result = "";
        for (int i=0; i < b.length; i++) {
            result +=
                    Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
        }
        return result;
    }
}
