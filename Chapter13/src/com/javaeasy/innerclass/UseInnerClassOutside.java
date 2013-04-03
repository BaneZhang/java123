package com.javaeasy.innerclass;

/**
 * User: Bane
 * Date: 13-4-2
 * Time: 16:27
 */
public class UseInnerClassOutside {
    private int variable = 6;

    public int getVariable() {
        return variable;
    }

    public class InnerClass {
        private int variable = 4;

        public int getVariable() {
            return variable;
        }
    }

    public static class StaticInnerClass {
        private int variable = 5;

        public int getVariable() {
            return variable;
        }
    }
}
