package com.MoodAnalysisTestGradle;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	
	public void testMoodAnalysis() {
		MoodAnalyser moodAnlayser = new MoodAnalyser();
		String mood = moodAnlayser.analyseMood("Iam in sad mood");
		
		//Assert Statement
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
		
	}
	
}
