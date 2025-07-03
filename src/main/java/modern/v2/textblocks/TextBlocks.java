package modern.v2.textblocks;

public class TextBlocks {

    public static String multiline() {
        var multiline = "This is a\n" +
                " mulitline string\n" +
                "with newlines inside";

        return multiline;
    }

    public static String multilineV2() {
        var multiline = """
                This is a
                 mulitline string
                with newlines inside 
                """;

        return multiline;
    }

    public static String multilineV2WithFormatted(String name) {
        var multiline = """
                Hello, %s!
                This is a
                 mulitline string
                with newlines inside 
                """.formatted(name);

        return multiline;
    }

    public static String sql() {
        var multiline = """
               select * from emp
               where firstname = 'navin'
               and last name = 'b'
                """;

        return multiline;
    }

    public static String json() {
        var multiline = """
        {
            "firstName": "Navin",
            "lastName": "B",
            "department": "Engineering",
            "active": true,
            "skills": ["Java", "SQL", "JSON"]
        }
        """;

        return multiline;
    }


    public static void main(String[] args) {
        System.out.println("MultilineString = " + multiline());
        System.out.println("MultilineString V2 = " + multilineV2());
        System.out.println("MultilineStringWithFormat = " + multilineV2WithFormatted("Navin"));
        System.out.println("SQL = " + sql());
        System.out.println("JSON = " + json());
    }
}
