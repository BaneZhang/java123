package com.javaeasy.innerclass;

/**
 * User: Bane
 * Date: 13-4-3
 * Time: 11:38
 */
public class UseMembers {
    private int variableInOutClass = 5;

    public class InnerVaribaleClass {
        private int variableInInnerClass;
        public int useOutVariable() {
            return this.variableInInnerClass + UseMembers.this.variableInOutClass;  // 非静态成员内部类中包含一个外部类的引用UseMembers.this
        }
    }
}
