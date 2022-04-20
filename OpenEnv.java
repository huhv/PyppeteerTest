public static void testOpenEnv()
        throws Exception {
  //自动下载，第一次下载后不会再下载
  BrowserFetcher.downloadIfNotExist(null);
  ArrayList<String> argList = new ArrayList<>();
  String path= "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome";
  argList.add("--no-sandbox");
  argList.add("--disable-setuid-sandbox");
  //mac必须指定位置，否则浏览器打不开
  LaunchOptions options = new LaunchOptionsBuilder().withArgs(argList).withHeadless(false).withExecutablePath(path).build();

  Browser browser = Puppeteer.launch(options);
  Page page = browser.newPage();
  List<CookieParam> cookies=new ArrayList<>();
  CookieParam cookie = new CookieParam();cookiees
  //为了跳过验证，使用cookies，其中遇到了跨域cookies访问的问题，这时候需要好好看看网站上的cookies的参数，看看后面有什么
  cookie.setName("xx");
  cookie.setValue(session);
  cookie.setDomain("xx");
  cookie.setSameSite("None");
  cookie.setSecure(true);
  cookies.add(cookie);
  page.setCookie(cookies);
  page.goTo("https://xx");

  String content = page.content();
  System.out.println("=======================content=============="+content);
  browser.close();
