package com.thacker.timberlog;

/*
public class CrashReportingTree extends Timber.Tree {

    CrashReportingTree(Context context) {
        CrashlyticsCore core = new CrashlyticsCore.Builder()
                .disabled(BuildConfig.DEBUG)
                .build();
        Fabric.with(context, new Crashlytics.Builder().core(core).build());
    }


    @Override
    protected void log(int priority, @Nullable String tag, @NotNull String message, @Nullable Throwable t) {

        // don't report log to Crashlytics if priority is Verbose or Debug
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return;
        }
        Crashlytics.log(priority, tag, message);

        if (t != null) {
            if (priority == Log.ERROR) {
                Crashlytics.logException(t);
            }
        }
    }
}
*/
