package pingwit.lec_4.hm.task_2;

public class WhatShallWeSee {
    private static String msg;

    static {
        msg = "static block";
    }

    {
        msg = "regular init block";
    }

    public WhatShallWeSee() {
        msg = "constructor value";
    }

    public static void main(String[] args) {
        WhatShallWeSee executionQueue = new WhatShallWeSee();

        System.out.println(executionQueue.msg);
    }
}


// последнее