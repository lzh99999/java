public static int forgDrop(int n) {
if (n == 1) {
return 1;
}
if (n == 2) {
return 2;
}
return forgDrop(n - 1) + forgDrop(n - 2);
}