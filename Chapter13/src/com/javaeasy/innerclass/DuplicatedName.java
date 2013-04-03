package com.javaeasy.innerclass;

/**
 * User: Bane
 * Date: 13-4-3
 * Time: 11:43
 */
public class DuplicatedName {
    private int variable = 5;

    class InnerClass {
        private int variable = 7;

        public int useOutVariable() {
            return this.variable + DuplicatedName.this.variable;
        }
    }
}
