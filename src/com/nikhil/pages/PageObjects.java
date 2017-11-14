package com.nikhil.pages;

public class PageObjects {

	public HomePage homepage = null;
	public DraftMail draftmail = null;

	public void HomePage() {
		if (homepage == null) {
			homepage = new HomePage();
		}
	}

	public void DraftMail() {
		if (draftmail == null) {
			draftmail = new DraftMail();
		}
	}

}
