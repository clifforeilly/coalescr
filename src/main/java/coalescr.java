import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class coalescr {

    static public String url;
    static public String baseurl;
    static public String searchstring;
    static public String parameters;
    static public String pagecontents;

    public coalescr(String purl) {

        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);

        try {
            HtmlPage page = client.getPage(purl);
            pagecontents = page.toString();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        baseurl = "https://www.google.co.uk/search?";
        searchstring = "q=minecraft+creeper";
        parameters = "&tbm=isch";

        url = baseurl + searchstring + parameters;
        coalescr c = new coalescr(url);




        // &client=opera
        // &tbas=0
        // &source=lnt
        // &sa=X
        // &ved=0ahUKEwiq3KS_4MzeAhUJAcAKHWf1AxsQpwUIHw&biw=1334
        // &bih=1203
        // &dpr=1.5




    }

}
