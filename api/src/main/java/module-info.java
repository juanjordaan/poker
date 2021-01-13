open module ussd.api {
    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;

    requires java.base;
    requires java.instrument;
    requires java.annotation;

    requires org.slf4j;

	requires poker.core;
	requires poker.fivecarddraw;
	requires poker.card;
}
