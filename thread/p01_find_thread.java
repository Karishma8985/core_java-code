class find_thread {
    public static void main(String[] args) {
        System.out.println("Let us find current thread...");
        Thread th = Thread.currentThread();
        System.out.println("Current thread = " + th);
        System.out.println("Its  name : " + th.getName());

    }
}