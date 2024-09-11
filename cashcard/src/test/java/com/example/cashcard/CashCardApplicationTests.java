package com.example.cashcard;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;


@JsonTest
class CashCardApplicationTests {
	@Autowired
	JacksonTester<CashCard>json;

	@Test
	void serialization() throws IOException {
		CashCard c = new CashCard(99, 123.45);
		assertThat(json.write(c)).isStrictlyEqualToJson("expected.json");
		assertThat(json.write(c)).hasJsonPathNumberValue("@.id");
		assertThat(json.write(c)).extractingJsonPathNumberValue("@.id").isEqualTo(99);
		assertThat(json.write(c)).hasJsonPathNumberValue("@.amount");
		assertThat(json.write(c)).extractingJsonPathNumberValue("@.amount").isEqualTo(123.45);

	}

	@Test
	void deserialization() throws IOException {
		String expected = """
           {
               "id":99,
               "amount":123.45
           }
           """;
		assertThat(json.parse(expected)).isEqualTo(new CashCard(99, 123.45));
		assertThat(json.parseObject(expected).id()).isEqualTo(99);
   		assertThat(json.parseObject(expected).amount()).isEqualTo(123.45);
		
	}

}
