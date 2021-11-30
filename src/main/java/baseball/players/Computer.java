package baseball.players;

import java.util.ArrayList;
import java.util.List;

import baseball.Constant;
import baseball.ball.Ball;
import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
	private List<Ball> balls;

	public List<Ball> getBalls() {
		return balls;
	}

	public List<Integer> randomNumberGenerate() {
		List<Integer> randomNumbers = new ArrayList<>();
		while (randomNumbers.size() < Constant.BALL_LIST_SIZE) {
			int number = Randoms.pickNumberInRange(Constant.BALL_MIN_VALUE, Constant.BALL_MAX_VALUE);
			if (!randomNumbers.contains(number)) {
				randomNumbers.add(number);
			}
		}
		return randomNumbers;
	}

	public List<Ball> selectBalls() {
		balls = new ArrayList<>();
		int position = 1;
		for (int generateNumber : randomNumberGenerate()) {
			Ball ball = new Ball(position++, generateNumber);
			balls.add(ball);
		}
		return balls;
	}
}
