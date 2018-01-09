// Sample java code for search.list

public static void main(String[] args) throws IOException {
    YouTube youtube = getYouTubeService();
    try {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("part", "snippet");
        parameters.put("maxResults", "25");
        parameters.put("q", "surfing");
        parameters.put("type", "video");

        YouTube.Search.List searchListByKeywordRequest = youtube.search().list(parameters.get("part").toString());
        if (parameters.containsKey("maxResults")) {
            searchListByKeywordRequest.setMaxResults(Long.parseLong(parameters.get("maxResults").toString()));
        }

        if (parameters.containsKey("q") && parameters.get("q") != "") {
            searchListByKeywordRequest.setQ(parameters.get("q").toString());
        }

        if (parameters.containsKey("type") && parameters.get("type") != "") {
            searchListByKeywordRequest.setType(parameters.get("type").toString());
        }

        SearchListResponse response = searchListByKeywordRequest.execute();
        System.out.println(response);
    }
}