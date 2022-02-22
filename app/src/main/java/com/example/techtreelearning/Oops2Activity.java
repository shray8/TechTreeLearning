package com.example.techtreelearning;

import android.graphics.Color;
import android.view.View;

public class Oops2Activity implements OopsActivity.ColorChange {

int color;
static int a;
static final int CONSTMYMETHOD = 10;

    public int buttonClick(View view) {

        color = Color.RED;
        return color;

    }


        static class Ivy {
            static int count = 100;

            public static int increment() {
                return ++count;
            }

            static int change() {
                a = 20;
                return a;
            }

            public int myMethod() {
                return CONSTMYMETHOD;
            }
        }


    }

