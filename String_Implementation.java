public class String_Implementation {
    public static void main(String[] args) {

        /* ================= StringBuffer =================
           - Mutable
           - Thread-safe (synchronized)
           - Slightly slower than StringBuilder
        */

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 3);
        sb.reverse();

        System.out.println("StringBuffer Output: " + sb);


        /* ================= StringBuilder =================
           - Mutable
           - NOT thread-safe
           - Faster than StringBuffer
        */

        StringBuilder sbuilder = new StringBuilder("Java");
        sbuilder.append(" Programming");
        sbuilder.insert(4, " Language");
        sbuilder.replace(0, 4, "Core Java");
        sbuilder.delete(5, 10);
        sbuilder.reverse();

        System.out.println("StringBuilder Output: " + sbuilder);


        /* ================= Capacity Example ================= */

        StringBuffer capacityExample = new StringBuffer();
        System.out.println("Initial Capacity: " + capacityExample.capacity());

        capacityExample.append("This is a long string to increase capacity");
        System.out.println("Capacity After Append: " + capacityExample.capacity());


        /* ================= Performance Difference ================= */

        long startTime = System.currentTimeMillis();
        StringBuffer bufferTest = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            bufferTest.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder builderTest = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builderTest.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ms");
    }
}
