public class Main {
    public static void main(String[] args) {
        System.out.println(PathUtils.getCanonicalPath("/var/www/./../logs")); // Output: /var/logs
        System.out.println(PathUtils.getCanonicalPath("./folder/../file.txt")); // Output: /file.txt
        System.out.println(PathUtils.getCanonicalPath("folder/./subfolder/../file")); // Output: /folder/file
    }
}
SSS