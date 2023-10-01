public class Convertor {
    public static void main(String[] args) {
        String strBool = "tRue";
        boolean boolVal = Boolean.parseBoolean(strBool);
        System.out.println(boolVal);

        String strByte = "120";
        byte byteVal = Byte.parseByte(strByte);
        System.out.println(byteVal);

        String strShort = "32000";
        short shortVal = Short.parseShort(strShort);
        System.out.println(shortVal);

        String strInt = "147895632";
        int intVal = Integer.parseInt(strInt);
        System.out.println(intVal);

        String strLong = "987654321987654321";
        long longVal = Long.parseLong(strLong);
        System.out.println(longVal);

        String strDouble = "4444.5d";
        double doubleVal = Double.parseDouble(strDouble);
        System.out.println(doubleVal);

        String strFloat = "2354.56f";
        float floatVal = Float.parseFloat(strFloat);
        System.out.println(floatVal);
    }
}
