package com.and.common;

/**
 * Created by ydx on 17-5-16.
 */

public class VersionManager {

    private static VersionManager versionManager = new VersionManager();

    private VersionManager(){
        version = new Version();
        String isTest = App.ContextHolder.getContext().getResources().getString(R.string.isTest);
        if(isTest.equals("true")){
            version.setTest(true);
        }else {
            version.setTest(false);
        }

    }

    public static VersionManager getInstance(){

        return versionManager;
    }
    private Version version;
    public
    class Version{
        boolean test;

        public boolean isTest() {
            return test;
        }

        public void setTest(boolean test) {
            this.test = test;
        }
    }

    public boolean isTestVersion(){
        return version.isTest();
    }
}
