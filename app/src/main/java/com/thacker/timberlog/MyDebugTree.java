package com.thacker.timberlog;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timber.log.Timber;

public class MyDebugTree extends Timber.DebugTree {

    @Override
    protected @Nullable String createStackElementTag(@NotNull StackTraceElement element) {

        return String.format("(%s:%s)#%s",
                element.getFileName(),
                element.getLineNumber(),
                element.getMethodName());

        /*return String.format("[%s#%s:%s]",
                super.createStackElementTag(element),
                element.getMethodName(),
                element.getLineNumber());*/

        /*return String.format("[L:%s] [M:%s] [C:%s]",
                element.getLineNumber(),
                element.getMethodName(),
                super.createStackElementTag(element));*/
//        return super.createStackElementTag(element);
    }
}