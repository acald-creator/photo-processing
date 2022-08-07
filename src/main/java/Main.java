import spark.Request;
import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        exception(Exception.class, (e, req, res) -> e.printStackTrace());
        get("/", (req, res) -> "Try GET /filteredimage?image={{}}");
        get("/filteredimage", (req, res) -> "Oops?! There is no url provided to load image.");
        after((req, res) -> {
            if (res.body() == null) {
                res.body(processImages(req));
            }
        });
    }
    private static String processImages(Request req) {
        String statusStr = req.queryParams("status");
        Map<String, Object> model = new HashMap<>();
        return statusStr;
    }
}

