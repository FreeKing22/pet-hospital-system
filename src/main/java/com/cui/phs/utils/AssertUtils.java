//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.cui.phs.utils;

import com.cui.phs.exception.ServiceException;

public class AssertUtils {
    private AssertUtils() {
    }

    public static <T> void assertNotNull(T data, String errCode, String errMsg) throws ServiceException {
        if (data == null) {
            throw new ServiceException(errCode, errMsg);
        }
    }

    public static void assertTrue(boolean flag, String errCode, String errMsg) throws ServiceException {
        if (!flag) {
            throw new ServiceException(errCode, errMsg);
        }
    }
}
