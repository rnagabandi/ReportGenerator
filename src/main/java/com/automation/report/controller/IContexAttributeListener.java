package com.automation.report.controller;

import org.testng.ITestContext;

public interface IContexAttributeListener {
	public void load(ITestContext testNGCtx, Context mauiCtx);
}
