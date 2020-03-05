public class StringManipulator{

    public String trimAndConcat(String strOne, String strTwo) {
        String trimone = strOne.trim();
        String trimTwo = strTwo.trim();
        String finalString = trimone.concat(trimTwo);
        return finalString;
    }

    public Integer getIndexOrNull(String strVal, char letter){
        Integer strIndex = strVal.indexOf(letter);
        if (strIndex > 0 ){
            return strIndex;
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String strVal, String subStr){
        Integer strIndex = strVal.indexOf(subStr);
        if (strIndex > 0 ){
            return strIndex;
        } else {
            return null;
        }
    }

    public String concatSubstring(String strOne, int start, int end, String strTwo){
        String subString = strOne.substring(start, end);
        String concatString = subString.concat(strTwo);
        return concatString;
    }


}