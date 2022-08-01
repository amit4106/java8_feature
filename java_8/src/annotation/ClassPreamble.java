package annotation;

import java.lang.annotation.Documented;

@Documented
public @interface ClassPreamble {
	String author();
	String date();
	int currentRevision() default 1;
	String lastModified() default "N/A";
	String lastModifiedBy() default "N/A";
//	use of array
	String[] reviewers();
}

//@ClassPreamble(
//		author = "Amit Sharma",
//		date = "09/06/2022",
//		currentRevision = 6,
//		lastModified = "01/06/2022",
//		lastModifiedBy = "Amit SHarma",
//		reviewers = {"Prem","Prakash","Pawan"}
//		)
