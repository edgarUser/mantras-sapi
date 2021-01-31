package mx.rememberme.mantras.sapi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import mx.rememberme.mantras.sapi.responses.Mantra;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GetMantraTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void getMantraId() {
		ResponseEntity<Mantra> entity = this.restTemplate.getForEntity("/mantra/1", Mantra.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);

	}

	@Test
	public void getMantra() {
		ResponseEntity<Object[]> entity = this.restTemplate.getForEntity("/mantra", Object[].class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
