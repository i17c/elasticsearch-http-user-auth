package org.elasticsearch.plugin.http.user.auth;

import java.util.Arrays;

/**
 * User: duxing
 * Date: 2016-03-06 23:52
 */
public class UrlAuthenticator {
    private static String[] unprotectlist;

    public static void setUnProtectList(String[] unprotectlist) {
        if (unprotectlist == null) unprotectlist = new String[]{};
        UrlAuthenticator.unprotectlist = unprotectlist;
    }

    public boolean isWhiteUrl(String url) {
        if (unprotectlist == null) return false;
        return Arrays.asList(unprotectlist).contains(url);
    }
}
