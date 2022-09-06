package com.splyzateam;

import com.splyzateam.entity.TeamsEntity;
import com.splyzateam.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SplyzaTeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplyzaTeamApplication.class, args);
	}

	@Component
	class DemoCommandLineRunner implements CommandLineRunner {

		@Autowired
		private TeamsRepository teamsRepository;

		@Override
		public void run(String... args) throws Exception {

			TeamsEntity teamsEntity = new TeamsEntity();
			teamsEntity.setId("57994f271ca5dd20847b910c");
			//member
			teamsEntity.getMembers().setAdministrators(1l);
			teamsEntity.getMembers().setEditors(6l);
			teamsEntity.getMembers().setManagers(18l);
			teamsEntity.getMembers().setMembers(58l);
			teamsEntity.getMembers().setSupporters(6l);
			teamsEntity.getMembers().setTotal(89l);
			//supporter
			teamsEntity.getPlan().setMemberLimit(100l);
			teamsEntity.getPlan().setSupporterLimit(20l);

			teamsRepository.save(teamsEntity);
		}
	}
}
