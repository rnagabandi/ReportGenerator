package com.automation.report.controller;

 import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;

import java.io.File;
import java.util.*;
import java.util.Map.Entry;

public class Context {

	public static final String INSTANCE = "instance";
	public static final String BROWSER = "browser";
	public static final String HOSTADDRESS = "host";
	public static final String UIHOSTADDRESS = "ui_host";
	public static final String REALM = "realm";
	public static final String TEST_RETRY_COUNT = "testRetryCount";
	public static final String TEST_RETRY_INTERVAL = "testRetryInterval";
	public static final String SOURCE_BRANCH_NAME = "source_branch_name";
	public static final String SELENIUM_GRID = "selenium_grid";
	public static final String NEW_BRANCH = "new_branch";
	public static final String REPOSITORIES = "repositories";
	public static final String TEST_EXECUTION_TIME = "time";
	public static final String SEARCHHOSTADDRESS = "search_host";
	public static final String BIZHOSTADDRESS = "biz_host";
	public static final String DISHOSTADDRESS = "dis_host";
	public static final String DBHOSTADDRESS = "db_host";
	public static final String DBUSERNAME = "db_userName";
	public static final String DBPASSWORD = "db_password";
	public static final String ENTITYHOSTADDRESS = "entity_host";
	public static final String MAUTICHOSTADDRESS = "mautic_host";
	public static final String MAUTICDBHOSTADDRESS = "mautic_dbhost";
	public static final String TEST_CONFIG = "testConfig";
	public static final String ENVIRONMENT = "environment_type";
	public static final String POOL = "pool";
	public static final String POOL_TYPE = "poolType";
	public static final String IE_DRIVER_PATH = "ieDriverPath";
	public static final String CHROME_DRIVER_PATH = "chromeDriverPath";
	public static final String BROWSER_DOWNLOAD_DIR = "browserDownloadDir";
	public static final String IMPLICIT_WAIT_TIME_OUT = "implicitWaitTimeOut";
	public static final String EXPLICIT_WAIT_TIME_OUT = "explicitWaitTimeOut";
	public static final String PAGE_LOAD_TIME_OUT = "pageLoadTimeout";
	public static final String WEB_DRIVER_GRID = "webDriverGrid";
	public static final String WEB_RUN_MODE = "webRunMode";
	public static final String WEB_RUN_BROWSER = "browser";
	public static final String WEB_RUN_BROWSER_VERSION = "browserVersion";
	public static final String WEB_SESSION_TIME_OUT = "webSessionTimeOut";
	public static final String USE_FIREFOX_DEFAULT_PROFILE = "firefoxProfle";
	public static final String CHROME_PROFILE_PATH = "chromeProfilePath";
	public static final String HEALTH_CHECK = "healthCheck";
	public static final String EMAIL_TO_LIST = "emailToList";
	public static final String PRODUCT_NAME = "productName";
	public static final String USERID = "userId";
	public static final String PASSWORD = "password";
	public static final String SCHEMANAME = "schemaName";
	public static final String SEARCHHOSTNAME = "searchHostName";
	public static final String CANDIDATEID = "candidateId";
	public static final String COMMONNAME = "commonName";
	public static final String PRIORITY = "priority";
	public static final String WEB_PROXY_ENABLED = "webProxyEnabled";
	public static final String WEB_PROXY_TYPE = "webProxyType";
	public static final String WEB_PROXY_ADDRESS = "webProxyAddress";
	public static final String API_PROXY_HOST = "apiProxyHost";
	public static final String API_PROXY_PORT = "apiProxyPort";
	public static final String API_CONTEXT = "apiContext";
	public static final String TEST_OBJECT = "testObject";
	public static final String OPEN_REPORT_IN_BROWSER = "openReportInBrowser";
	public static final String CAPTURE_SNAPSHOT = "captureSnapshot";
	public static final String DB_LOG_ENABLED = "dbLogEnabled";
	public static final String SOFT_ASSERT_ENABLED = "softAssertEnabled";
	public static final String OUTPUT_DIRECTORY = "outputDirectory";
	public static final String EMAIL_RETENTION_POLICY = "emailRetentionPolicy";
	public static final String URL_CONVERT_CLASS = "urlConvertClass";
	public static final String WEB_DRIVER_LISTENER = "webDriverListener";
	public static final String TEST_METHOD_SIGNATURE = "testMethodSignature";
	public static final String TEST_DATA_FILE = "testDataFile";
	public static final String MONGODBHOSTADDRESS = "mongo_Db_Host";
	public static final String MONGODBPORT = "mongo_Db_Port";
	public static final String MONGODATABASENAME = "mongo_Db_Name";
	public static final String ELASTICSEARCHADDERSS = "elastic_search";
	public static final String MATCHALLOCATEADDRESS = "match_allocate";
	public static final String MATCHALLOCATESTATUS = "match_allocate_statu";
	public static final String JOBNAME = "jobName";
	public static final String DYNAMICDISPLAYID = "dynamic_display_id";
	public static final String DATAPREPARATION = "data_Preparation";
	public static final String DATAVALIDATION = "data_validation";
	public static final String RUNMNA = "run_mna";
	public static final String TESTCASEEXECUTION = "test_case_execution";
	public static final String DATADELETION = "data_deletion";
	public static final String CANDIDATEDISPLAYIDS = "candidateDisplayIds";
	public static final String REQUISITIONDISPLAYIDS = "requisitionDisplayIds";
	
	private static Logger logger = Logging.getLogger(Context.class);
	private Map<ITestResult, List<Throwable>> verificationFailuresMap = new HashMap<ITestResult, List<Throwable>>();
	private Map<String, Object> contextDataMap = Collections.synchronizedMap(new HashMap<String, Object>());
	private ITestContext testNGContext = null;
	
	public Context(ITestContext context) {
		this.testNGContext = context;
		this.setContextAttribute(context, "candidateDisplayIds", System.getProperty("candidateDisplayIds"), "CID");
		this.setContextAttribute(context, "requisitionDisplayIds", System.getProperty("requisitionDisplayIds"), "RID");
		this.setContextAttribute(context, "instance", System.getProperty("instance"), "Accenture");
		this.setContextAttribute(context, "browser", System.getProperty("browser"), "*Firefox");
		this.setContextAttribute(context, "host", System.getProperty("host"), "http://192.168.2.104:8100");
		this.setContextAttribute(context, "userId", System.getProperty("userId"), "tester@idfc.com");
		this.setContextAttribute(context, "password", System.getProperty("password"), "spire@123");
		this.setContextAttribute(context, "schemaName", System.getProperty("schemaName"), "idfc_schema");
		this.setContextAttribute(context, "searchHostName", System.getProperty("searchHostName"), "192.168.2.75:8381");
		this.setContextAttribute(context, "candidateId", System.getProperty("candidateId"), "123456");
		this.setContextAttribute(context, "commonName", System.getProperty("commonName"), "common");
		this.setContextAttribute(context, "priority", System.getProperty("priority"),
				"P1-Critical,P2-High,P3-Medium,P4-Low");
		this.setContextAttribute(context, "ui_host", System.getProperty("ui_host"),
				"http://staging.vista.corp.spire.com");
		this.setContextAttribute(context, "realm", System.getProperty("realm"), "Realm1");
		this.setContextAttribute(context, "testRetryInterval", System.getProperty("testRetryInterval"), "5");
		this.setContextAttribute(context, "testRetryCount", System.getProperty("testRetryCount"), "3");
		this.setContextAttribute(context, "source_branch_name", System.getProperty("source_branch_name"),
				"source_branch_name");
		this.setContextAttribute(context, "selenium_grid", System.getProperty("selenium_grid"), "false");
		this.setContextAttribute(context, "new_branch", System.getProperty("new_branch"), "new_branch");
		this.setContextAttribute(context, "repositories", System.getProperty("repositories"), "repositories");
		this.setContextAttribute(context, "time", System.getProperty("time"), "0");
		this.setContextAttribute(context, "biz_host", System.getProperty("biz_host"), "http://192.168.2.124:8085");
		this.setContextAttribute(context, "dis_host", System.getProperty("dis_host"), "http://192.168.2.124:8081");
		this.setContextAttribute(context, "search_host", System.getProperty("search_host"),
				"http://192.168.2.156:8086");
		this.setContextAttribute(context, "db_host", System.getProperty("db_host"), "://192.168.2.124:3306");
		this.setContextAttribute(context, "db_userName", System.getProperty("db_userName"), "root");
		this.setContextAttribute(context, "entity_host", System.getProperty("entity_host"), "http://192.168.2.69:8085");
		this.setContextAttribute(context, "environment_type", System.getProperty("environment_type"), "TEST");
		this.setContextAttribute(context, "mautic_host", System.getProperty("mautic_host"), "http://172.16.1.209:8080");
		this.setContextAttribute(context, "mautic_dbhost", System.getProperty("mautic_dbhost"), "://192.168.2.69:3306");
		this.setContextAttribute(context, "healthCheck", System.getProperty("healthCheck"), "false");
		this.setContextAttribute(context, "emailToList", System.getProperty("emailToList"),
				"raghavender.nagabandi@spire2grow.com");
		this.setContextAttribute(context, "productName", System.getProperty("productName"), "Talentvista");
		this.setContextAttribute(context, "testDataFile", System.getProperty("testDataFile"), "testCase");
		this.setContextAttribute(context, "mongo_Db_Host", System.getProperty("mongo_Db_Host"), "MongoHost");
		this.setContextAttribute(context, "mongo_Db_Port", System.getProperty("mongo_Db_Port"), "MongoPort");
		this.setContextAttribute(context, "mongo_Db_Name", System.getProperty("mongo_Db_Name"), "MongoDBName");
		this.setContextAttribute(context, "elastic_search", System.getProperty("elastic_search"), "192.168.2.175:7200");
		this.setContextAttribute(context, "match_allocate", System.getProperty("match_allocate"), "192.168.2.175:7200");
		this.setContextAttribute(context, "jobName", System.getProperty("jobName"), "ACCENTURE_IDC");
		this.setContextAttribute(context, "dynamic_display_id", System.getProperty("dynamic_display_id"), "true");
		this.setContextAttribute(context, "data_Preparation", System.getProperty("data_Preparation"), "true");
		this.setContextAttribute(context, "data_validation", System.getProperty("data_validation"), "true");
		this.setContextAttribute(context, "run_mna", System.getProperty("run_mna"), "true");
		this.setContextAttribute(context, "test_case_execution", System.getProperty("test_case_execution"), "true");
		this.setContextAttribute(context, "data_deletion", System.getProperty("data_deletion"), "true");
		this.setContextAttribute(context, "pool", System.getProperty("pool"), "staging");
		this.setContextAttribute(context, "poolType", System.getProperty("poolType"), "qa");
		this.setContextAttribute(context, "firefoxProfle", System.getProperty("firefoxProfle"), "spireAutoProfile");
		this.setContextAttribute(context, "chromeProfilePath", System.getProperty("chromeProfilePath"),
				"%LOCALAPPDATA%\\Google\\Chrome\\User Data\\SpireChromeProfile");
		this.setContextAttribute(context, "webSessionTimeOut", System.getProperty("webSessionTimeOut"), "90000");
		this.setContextAttribute(context, "implicitWaitTimeOut", System.getProperty("implicitWaitTimeOut"), "5");
		this.setContextAttribute(context, "explicitWaitTimeOut", System.getProperty("explicitWaitTimeOut"), "15");
		this.setContextAttribute((ITestContext) context, "browserVersion", System.getProperty("browserVersion"),
				(String) null);
		this.setContextAttribute((ITestContext) context, "chromeDriverPath", System.getProperty("chromeDriverPath"),
				(String) null);
		this.setContextAttribute((ITestContext) context, "ieDriverPath", System.getProperty("ieDriverPath"),
				(String) null);
		this.setContextAttribute((ITestContext) context, "browserDownloadDir", System.getProperty("browserDownloadDir"),
				(String) null);
		this.setContextAttribute(context, "webProxyEnabled", System.getProperty("webProxyEnabled"), "false");
		this.setContextAttribute((ITestContext) context, "webProxyType", System.getProperty("webProxyType"),
				(String) null);
		this.setContextAttribute((ITestContext) context, "webProxyAddress", System.getProperty("webProxyAddress"),
				(String) null);
		this.setContextAttribute((ITestContext) context, "apiProxyHost", System.getProperty("apiProxyHost"),
				(String) null);
		this.setContextAttribute((ITestContext) context, "apiProxyPort", System.getProperty("apiProxyPort"),
				(String) null);
		this.setContextAttribute((ITestContext) context, "openReportInBrowser",
				System.getProperty("openReportInBrowser"), (String) null);
		this.setContextAttribute(context, "captureSnapshot", System.getProperty("captureSnapshot"), "true");
		this.setContextAttribute(context, "dbLogEnabled", System.getProperty("dbLogEnabled"), "true");
		this.setContextAttribute(context, "softAssertEnabled", System.getProperty("softAssertEnabled"), "true");
		this.setContextAttribute(context, "emailRetentionPolicy", System.getProperty("emailRetentionPolicy"), "1");
		this.setContextAttribute((ITestContext) context, "webDriverListener", System.getProperty("webDriverListener"),
				(String) null);
		if (context != null) {
			this.setContextAttribute((String) "outputDirectory", (String) null, context.getOutputDirectory(),
					(String) null);
			this.setContextAttribute(context);
			(new File(context.getOutputDirectory() + "/screenshots")).mkdirs();
			(new File(context.getOutputDirectory() + "/htmls")).mkdirs();
			(new File(context.getOutputDirectory() + "/xmls")).mkdirs();
			(new File(context.getOutputDirectory() + "/textfiles/")).mkdirs();
		}

	}
	
	public void addVerificationFailures(ITestResult result, List<Throwable> failures) {
		this.verificationFailuresMap.put(result, failures);
	}

	public void addVerificationFailures(ITestResult result, Throwable failure) {
		if (this.verificationFailuresMap.get(result) != null) {
			((List) this.verificationFailuresMap.get(result)).add(failure);
		} else {
			ArrayList failures = new ArrayList();
			failures.add(failure);
			this.addVerificationFailures(result, (List) failures);
		}

	}

	public Object getAttribute(String name) {
		Object obj = this.contextDataMap.get(name);
		return obj == null ? "Firefox" : obj;
	}

	public String getBrowserDownloadDir() {
		return this.getAttribute("browserDownloadDir") != null ? (String) this.getAttribute("browserDownloadDir")
				: this.getOutputDirectory() + "\\downloads\\";
	}

	public String getChromeDriverPath() {
		return (String) this.getAttribute("chromeDriverPath");
	}

	public double getEmailRetentionPolicy() {
		try {
			return Double.parseDouble((String) this.getAttribute("emailRetentionPolicy"));
		} catch (Exception var2) {
			return 1.0D;
		}
	}

	public int getExplicitWaitTimeout() {
		Integer timeout;
		try {
			timeout = Integer.valueOf(Integer.parseInt((String) this.getAttribute("explicitWaitTimeOut")));
		} catch (Exception var3) {
			timeout = Integer.valueOf(15);
		}

		return (double) timeout.intValue() < this.getImplicitWaitTimeout() ? (int) this.getImplicitWaitTimeout()
				: timeout.intValue();
	}

	public void setExplicitWaitTimeout(double timeout) {
		this.setAttribute("explicitWaitTimeOut", Double.valueOf(timeout));
	}

	public String getIEDriverPath() {
		return (String) this.getAttribute("ieDriverPath");
	}

	public double getImplicitWaitTimeout() {
		try {
			return Double.parseDouble((String) this.getAttribute("implicitWaitTimeOut"));
		} catch (Exception var2) {
			return 5.0D;
		}
	}

	public void setImplicitWaitTimeout(double timeout) {
		this.setAttribute("implicitWaitTimeOut", Double.valueOf(timeout));
	}

	public void setTime(String time) {
		this.setAttribute("time", time);
	}

	public String getOpenReportInBrowser() {
		return (String) this.getAttribute("openReportInBrowser");
	}

	public String getCandidateId() {
		return (String) this.getAttribute("candidateId");
	}

	public void setOpenReportInBrowser(String browser) {
		this.setAttribute("openReportInBrowser", browser);
	}

	public String getOutputDirectory() {
		return (String) this.getAttribute("outputDirectory");
	}

	public String getPool() {
		return (String) this.getAttribute("pool");
	}

	public void setPool(String pool) {
		this.setAttribute("pool", pool);
	}

	public String getInstance() {
		return (String) this.getAttribute("instance");
	}

	public void setInstance(String instance) {
		this.setAttribute("instance", instance);
	}

	public String getFirefoxProfile() {
		return (String) this.getAttribute("firefoxProfle");
	}

	public void setFirefoxProfile(String firefoxDefaultProfile) {
		this.setAttribute("firefoxProfle", firefoxDefaultProfile);
	}

	public String getChromeProfilePath() {
		return (String) this.getAttribute("chromeProfilePath");
	}

	public String getBrowser() {
		return (String) this.getAttribute("browser");
	}

	public void setBrowser(String browser) {
		this.setAttribute("browser", browser);
	}

	public String getHostAddress() {
		return (String) this.getAttribute("host");
	}

	public String getUIHostAddress() {
		return (String) this.getAttribute("ui_host");
	}

	public String getRealm() {
		return (String) this.getAttribute("realm");
	}

	public String getTestRetryCount() {
		return (String) this.getAttribute("testRetryCount");
	}

	public String getTestRetryInterval() {
		return (String) this.getAttribute("testRetryInterval");
	}

	public String getSourceBranchName() {
		return (String) this.getAttribute("source_branch_name");
	}

	public String getSeleniumGrid() {
		return (String) this.getAttribute("selenium_grid");
	}

	public String getNewBranch() {
		return (String) this.getAttribute("new_branch");
	}

	public String getRepositories() {
		return (String) this.getAttribute("repositories");
	}

	public String getTime() {
		return (String) this.getAttribute("time");
	}

	public String getSchemaName() {
		return (String) this.getAttribute("schemaName");
	}

	public String getSearchSchemaName() {
		return (String) this.getAttribute("searchSchemaName");
	}

	public String getCommonName() {
		return (String) this.getAttribute("commonName");
	}

	public String getPriority() {
		return (String) this.getAttribute("priority");
	}

	public String getUserid() {
		return (String) this.getAttribute("userId");
	}

	public String getPassword() {
		return (String) this.getAttribute("password");
	}

	public String getBIZHostAddress() {
		return (String) this.getAttribute("biz_host");
	}

	public String getDISHostAddress() {
		return (String) this.getAttribute("dis_host");
	}

	public String getSEARCHHOSTADDRESS() {
		return (String) this.getAttribute("search_host");
	}

	public String getDBHostAddress() {
		return (String) this.getAttribute("db_host");
	}

	public String getDBUSERNAME() {
		return (String) this.getAttribute("db_userName");
	}

	public String getDBPASSWORD() {
		return (String) this.getAttribute("db_password");
	}

	public String getSearchHostName() {
		return (String) this.getAttribute("searchHostName");
	}

	public String getEntityHostAddress() {
		return (String) this.getAttribute("entity_host");
	}

	public String getEnvironment() {
		return (String) this.getAttribute("environment_type");
	}

	public String getMauticHostAddress() {
		return (String) this.getAttribute("mautic_host");
	}

	public String getMauticDbHostAddress() {
		return (String) this.getAttribute("mautic_dbhost");
	}

	public String getPoolType() {
		return (String) this.getAttribute("poolType");
	}

	public String getSuiteParameter(String key) {
		return System.getProperty(key) != null ? System.getProperty(key)
				: this.getTestNGContext().getSuite().getParameter(key);
	}

	/*
	 * public LinkedList<TearDownService> getTearDownServices() { return
	 * this.teardowns; }
	 */

	public String getTestDataFile() {
		return (String) this.getAttribute("testDataFile");
	}

	public void setTestDataFile(String testDataFile) {
		this.setAttribute("testDataFile", testDataFile);
	}

	public String getTestMethodSignature() {
		return (String) this.getAttribute("testMethodSignature");
	}

	public ITestContext getTestNGContext() {
		return this.testNGContext;
	}

	public String getWebDriverListener() {
		return (String) this.getAttribute("webDriverListener");
	}

	public List<Throwable> getVerificationFailures(ITestResult result) {
		List verificationFailures = (List) this.verificationFailuresMap.get(result);
		return (List) (verificationFailures == null ? new ArrayList() : verificationFailures);
	}

	public String getWebBrowserVersion() {
		return (String) this.getAttribute("browserVersion");
	}

	public String getWebDriverGrid() {
		return (String) this.getAttribute("webDriverGrid");
	}

	public String getWebProxyAddress() {
		return (String) this.getAttribute("webProxyAddress");
	}

	public String getWebProxyType() {
		return (String) this.getAttribute("webProxyType");
	}

	public String getWebRunBrowser() {
		return (String) this.getAttribute("browser");
	}

	public String getWebRunMode() {
		return (String) this.getAttribute("webRunMode");
	}

	public int getWebSessionTimeout() {
		try {
			return Integer.parseInt((String) this.getAttribute("webSessionTimeOut"));
		} catch (Exception var2) {
			return 90000;
		}
	}

	public boolean isCaptureSnapshot() {
		try {
			return Boolean.parseBoolean((String) this.getAttribute("captureSnapshot"));
		} catch (Exception var2) {
			return true;
		}
	}

	public String getUrlConvertClass() {
		return (String) this.getAttribute("urlConvertClass");
	}

	public boolean isDBLogEnabled() {
		try {
			return Boolean.parseBoolean((String) this.getAttribute("dbLogEnabled"));
		} catch (Exception var2) {
			return true;
		}
	}

	public boolean isSoftAssertEnabled() {
		try {
			return Boolean.parseBoolean((String) this.getAttribute("softAssertEnabled"));
		} catch (Exception var2) {
			return false;
		}
	}

	public void setAttribute(String name, Object value) {
		this.contextDataMap.put(name, value);
	}

	private void setContextAttribute(ITestContext context) {
		if (context != null) {
			Map testParameters = context.getSuite().getXmlSuite().getParameters();
			Iterator var3 = testParameters.entrySet().iterator();

			while (var3.hasNext()) {
				Entry entry = (Entry) var3.next();
				String attributeName = (String) entry.getKey();
				if (this.contextDataMap.get(entry.getKey()) == null) {
					String sysPropertyValue = System.getProperty((String) entry.getKey());
					String suiteValue = (String) entry.getValue();
					this.setContextAttribute((String) attributeName, sysPropertyValue, suiteValue, (String) null);
				}
			}
		}

	}

	private void setContextAttribute(ITestContext context, String attributeName, String sysPropertyValue,
			String defaultValue) {
		String suiteValue = null;
		if (context != null) {
			suiteValue = context.getSuite().getParameter(attributeName);
		}

		this.contextDataMap.put(attributeName,
				sysPropertyValue != null ? sysPropertyValue : (suiteValue != null ? suiteValue : defaultValue));
	}

	public String getContextAttribute(String attributeName, String defaultValue) {
		String suiteValue = null;
		if (testNGContext != null) {
			suiteValue = testNGContext.getSuite().getParameter(attributeName);
		}
		suiteValue = suiteValue != null ? suiteValue : defaultValue;
		this.contextDataMap.put(attributeName, suiteValue);
		return suiteValue;

	}

	private void setContextAttribute(String attributeName, String sysPropertyValue, String suiteValue,
			String defaultValue) {
		this.contextDataMap.put(attributeName,
				sysPropertyValue != null ? sysPropertyValue : (suiteValue != null ? suiteValue : defaultValue));
	}

	public void setHOSTADDRESS(String HOSTADDRESS) {
		this.setAttribute(HOSTADDRESS, HOSTADDRESS);
	}

	public void setUIHOSTADDRESS(String UIHOSTADDRESS) {
		this.setAttribute(UIHOSTADDRESS, UIHOSTADDRESS);
	}

	public void setBIZHOSTADDRESS(String BIZHOSTADDRESS) {
		this.setAttribute(BIZHOSTADDRESS, BIZHOSTADDRESS);
	}

	public void setDISHOSTADDRESS(String DISHOSTADDRESS) {
		this.setAttribute(DISHOSTADDRESS, DISHOSTADDRESS);
	}

	public void setSEARCHHOSTADDRESS(String SEARCHHOSTADDRESS) {
		this.setAttribute(SEARCHHOSTADDRESS, SEARCHHOSTADDRESS);
	}

	public void setSEARCHHOSTNAME(String SEARCHHOSTNAME) {
		this.setAttribute(SEARCHHOSTNAME, SEARCHHOSTNAME);
	}

	public void setDBHOSTADDRESS(String DBHOSTADDRESS) {
		this.setAttribute(DBHOSTADDRESS, DBHOSTADDRESS);
	}

	public void setDBUSERNAME(String DBUSERNAME) {
		this.setAttribute(DBUSERNAME, DBUSERNAME);
	}

	public void setDBPASSWORD(String DBPASSWORD) {
		this.setAttribute(DBPASSWORD, DBPASSWORD);
	}

	public void setUSERID(String USERID) {
		this.setAttribute(USERID, USERID);
	}

	public void setPASSWORD(String PASSWORD) {
		this.setAttribute(PASSWORD, PASSWORD);
	}

	public void setENTITYHOSTADDRESS(String ENTITYHOSTADDRESS) {
		this.setAttribute(ENTITYHOSTADDRESS, ENTITYHOSTADDRESS);
	}

	public void setEnvironment(String ENVIRONMENT) {
		this.setAttribute(ENVIRONMENT, ENVIRONMENT);
	}

	public void setPriority(String PRIORITY) {
		this.setAttribute(PRIORITY, PRIORITY);
	}

	public String getHealthCheck() {
		return (String) this.getAttribute("healthCheck");
	}

	public String getEmailToList() {
		return (String) this.getAttribute("emailToList");
	}

	public void setEmailToList(String emailToList) {
		this.setAttribute("emailToList", emailToList);
	}

	public String getProductName() {
		return (String) this.getAttribute("productName");
	}

	public void setProductName(String productName) {
		this.setAttribute("productName", productName);
	}

	public String getMONGODBHOSTADDRESS() {
		return (String) this.getAttribute("mongo_Db_Host");
	}

	public void setMONGODBHOSTADDRESS(String MONGODBHOSTADDRESS) {
		this.setAttribute(MONGODBHOSTADDRESS, MONGODBHOSTADDRESS);
	}

	public String getMONGODBPORT() {
		return (String) this.getAttribute("mongo_Db_Port");
	}

	public void setMONGODBPORT(String MONGODBPORT) {
		this.setAttribute(MONGODBPORT, MONGODBPORT);
	}

	public String getMONGODATABASENAME() {
		return (String) this.getAttribute("mongo_Db_Name");
	}

	public void setMONGODATABASENAME(String MONGODATABASENAME) {
		this.setAttribute(MONGODATABASENAME, MONGODATABASENAME);
	}

	public String getELASTICSEARCHADDERSS() {
		return (String) this.getAttribute("elastic_search");
	}

	public void setELASTICSEARCHADDERSS(String ELASTICSEARCH) {
		this.setAttribute(ELASTICSEARCHADDERSS, ELASTICSEARCHADDERSS);
	}

	public String getMATCHALLOCATEADDRESS() {
		return (String) this.getAttribute("match_allocate");
	}

	public void setMATCHALLOCATEADDRESS(String MATCHALLOCATEADDRESS) {
		this.setAttribute(MATCHALLOCATEADDRESS, MATCHALLOCATEADDRESS);
	}

	public String getJOBNAME() {
		return (String) this.getAttribute("jobName");
	}

	public void setJOBNAME(String JOBNAME) {
		this.setAttribute(JOBNAME, JOBNAME);
	}

	public String getDATAPREPARATION() {
		return (String) this.getAttribute("data_Preparation");
	}

	public void setDATAPREPARATION(String DATAPREPARATION) {
		this.setAttribute(DATAPREPARATION, DATAPREPARATION);
	}

	public String getDATAVALIDATION() {
		return (String) this.getAttribute("data_validation");
	}

	public void setDATAVALIDATION(String DATAVALIDATION) {
		this.setAttribute(DATAVALIDATION, DATAVALIDATION);
	}

	public String getRUNMNA() {
		return (String) this.getAttribute("run_mna");
	}

	public void setRUNMNA(String RUNMNA) {
		this.setAttribute(RUNMNA, RUNMNA);
	}

	public String getTESTCASEEXECUTION() {
		return (String) this.getAttribute("test_case_execution");
	}

	public void setTESTCASEEXECUTION(String TESTCASEEXECUTION) {
		this.setAttribute(TESTCASEEXECUTION, TESTCASEEXECUTION);
	}

	public String getDATADELETION() {
		return (String) this.getAttribute("data_deletion");
	}

	public void setDATADELETION(String DATADELETION) {
		this.setAttribute(DATADELETION, DATADELETION);
	}

	public String getDYNAMICDISPLAYID() {
		return (String) this.getAttribute("dynamic_display_id");
	}

	public void setDYNAMICDISPLAYID(String DYNAMICDISPLAYID) {
		this.setAttribute(DYNAMICDISPLAYID, DYNAMICDISPLAYID);
	}
}
