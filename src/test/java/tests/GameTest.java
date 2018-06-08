package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.testare.config.ProjectConfig;
import com.testare.main.Game;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProjectConfig.class)
public class GameTest {

	// vreau sa testez ca atunic se lovesc bilele
	// si nu s-a lovit nici-o popica => scor 0

	@Test
	public void oneThrowNoItemsDown() {
		Game game = new Game();
		game.throwBall(0);
		Assert.isTrue(game.getScore() == 0, "No item was down but score is not 0");
	}

	@Test
	public void oneThrowNoFiveItemsDown() {
		Game game = new Game();
		game.throwBall(5);
		Assert.isTrue(game.getScore() == 5, "Five items were down but is not ");
	}
	
	// cate lovituri poate arunca un jucator?
	// vreau sa arunc 20 de lovituri
	// verific daca 2 dintre ele au suma 10
	
	@Test
	public void throw20TimesOneSpareAndRest0() {
		Game game = new Game();
		game.throwBall(6);
		game.throwBall(4);
		game.throwBall(7);
		
		for(int i = 0; i < 17; i++) {
			game.throwBall(0);
		}
		
		Assert.isTrue(game.getScore() == 24);
	}
	
}
