package co.uberdev.ultimateorganizer.core;

/**
 * Created by oguzbilgener on 15/04/14.
 */
public class CoreUtils
{
    public static int getUnixTimestamp()
    {
        return (int) (System.currentTimeMillis()/1000);
    }

    public static String generatePublicKey(String emailAddress, String salt)
    {
        return CoreCrypto.sha1(salt + emailAddress);
    }

    public static String generateSecretToken( String emailAddress, String hashedPassword, String secretSalt)
    {
        return CoreCrypto.sha1( secretSalt + randomAlphanumericString(10) + emailAddress + hashedPassword);
    }

    public static int randomNumber(int a, int b)
    {
        return a + (int)(Math.random()*(b-a));
    }

    public static String randomAlphanumericString(int length)
    {
        String set = "abcdefghijklmnopqrstuwxyz0123456789";
        StringBuilder builder = new StringBuilder();
        for(int i=0; i < length; i++)
        {
            builder.append(set.charAt( randomNumber(0, set.length()) ));
        }
        return builder.toString();
    }
}
