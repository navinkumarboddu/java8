package exception.coding;

public class ExecutionFlow {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("a");
        } catch (Exception e){
            sb.append("b");
        } finally {
            sb.append("c");
        }
        sb.append("d");
        System.out.println(sb);

        sb = new StringBuilder();
        String str = null;
        try {
            sb.append("a");
            str.toUpperCase();
            sb.append("b");
        } catch(IllegalArgumentException ie){
            sb.append("c");
        } catch (Exception e){
            sb.append("d");
        } finally {
            sb.append("e");
        }
        System.out.println(sb);
    }
}
