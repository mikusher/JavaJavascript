




package cv.mikusher.enumexample;





public enum WhoisRIR {
    ARIN("whois.arin.net"),
    RIPE("whois.ripe.net"),
    APNIC("whois.apnic.net"),
    AFRINIC("whois.afrinic.net"),
    LACNIC("whois.lacnic.net"),
    JPNIC("whois.nic.ad.jp"),
    KRNIC("whois.nic.or.kr"),
    CNNIC("ipwhois.cnnic.cn"),
    UNKNOWN("");

    private String url;





    WhoisRIR(String url) {

        this.url = url;
    }





    public String url() {

        return url;
    }
}