class try_catch{
    public static void main(String args[]) {
        try {
                int a = 10/0;       // number can't be divided by 0. will generate error
        } catch (Exception e) {
            System.out.println(e);                    // TODO: handle exception
            throw e;    // work same as print statement.... give error line also in output...
        }
        
    }
}