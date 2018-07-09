package samsung.lets.get.it;

import java.util.ArrayList;
import java.util.Scanner;


//로봇 시뮬레이션
public class num2173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// A: 가로, B: 세로
		int A = sc.nextInt();
		int B = sc.nextInt();
		// N: 로봇의 수, M: 명령어 수
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<String> result = new ArrayList();

		// AxB땅을 만들자 / 초기값=0
		int AxB[][] = new int[A][B];
		for (int i = 0; i < A; i++)
			for (int j = 0; j < B; j++) {
				AxB[i][j] = 0;
			}

		// ok를 위한 변수
		boolean ok = true;

		// 로봇의 위치 입력 / 값=1
		int x, y;
		String d;
		int dd;
		robotObj[] robot = new robotObj[N + 1];
		for (int i = 1; i < N + 1; i++) {
			robot[i] = new robotObj();
			x = sc.nextInt();
			y = sc.nextInt();
			d = sc.next();
			
			robot[i].setX(x);
			robot[i].setY(y);
			switch(d) {
			case "N" :robot[i].setDirection(0);break;
			case "E" :robot[i].setDirection(1);break;
			case "S" :robot[i].setDirection(2);break;
			case "W" :robot[i].setDirection(3);break;
			}
			
			
			AxB[x - 1][y - 1] = i;
		}

		// 명령어 입력
		int op1 = 0;
		int op3 = 0;
		String op2 = "";
		
		try {
			for (int i = 0; i < M; i++) {
				op1 = sc.nextInt();
				op2 = sc.next();
				op3 = sc.nextInt();
				switch (op2) {
				case "F":
					switch (robot[op1].getDirection()) {
					// 잘못된 명령어 case2 검사
					case 0:
						for (int j = 0; j < op3; j++) {
							AxB[robot[op1].getX()-1][robot[op1].getY()-1] = 0;
							robot[op1].setY(robot[op1].getY() + 1);
							if(robot[op1].getX()>A||robot[op1].getY()>B) {
								 result.add("Robot "+op1+" crashes into the wall");
								 break;
							}
							if (AxB[robot[op1].getX() - 1][robot[op1].getY() - 1] != 0) {
								result.add("Robot " + op1 + " crashes into robot "
										+ AxB[robot[op1].getX() - 1][robot[op1].getY() - 1]);
								ok = false;
							}
							AxB[robot[op1].getX()-1][robot[op1].getY()-1] = op1;
						}
						break;
					case 1:
						for (int j = 0; j < op3; j++) {
							AxB[robot[op1].getX()-1][robot[op1].getY()-1] = 0;
							robot[op1].setX(robot[op1].getX() + 1);
							if(robot[op1].getX()>A||robot[op1].getY()>B) {
								 result.add("Robot "+op1+" crashes into the wall");
								 break;
							}
							if (AxB[robot[op1].getX() - 1][robot[op1].getY() - 1] != 0) {
								result.add("Robot " + op1 + " crashes into robot "
										+ AxB[robot[op1].getX() - 1][robot[op1].getY() - 1]);
								ok = false;
							}
							AxB[robot[op1].getX()-1][robot[op1].getY()-1] = op1;
						}
						break;
					case 2:
						for (int j = 0; j < op3; j++) {
							AxB[robot[op1].getX()-1][robot[op1].getY()-1] = 0;
							robot[op1].setY(robot[op1].getY() - 1);
							if(robot[op1].getX()>A||robot[op1].getY()>B) {
								 result.add("Robot "+op1+" crashes into the wall");
								 break;
							}
							if (AxB[robot[op1].getX() - 1][robot[op1].getY() - 1] != 0) {
								result.add("Robot " + op1 + " crashes into robot "
										+ AxB[robot[op1].getX() - 1][robot[op1].getY() - 1]);
								ok = false;
							}
							AxB[robot[op1].getX()-1][robot[op1].getY()-1] = op1;
						}
						break;
					case 3:
						for (int j = 0; j < op3; j++) {
							AxB[robot[op1].getX()-1][robot[op1].getY()-1] = 0;
							robot[op1].setX(robot[op1].getX() - 1);
							if(robot[op1].getX()>A||robot[op1].getY()>B) {
								 result.add("Robot "+op1+" crashes into the wall");
								 break;
							}
							if (AxB[robot[op1].getX() - 1][robot[op1].getY() - 1] != 0) {
								result.add("Robot " + op1 + " crashes into robot "
										+ AxB[robot[op1].getX() - 1][robot[op1].getY() - 1]);
								ok = false;
							}
							AxB[robot[op1].getX()-1][robot[op1].getY()-1] = op1;
						}
						break;
					}
					
					 
					break;
				case "L":
					switch (robot[op1].getDirection() - op3%4 < 0 ? robot[op1].getDirection() - op3%4 + 4 : robot[op1].getDirection() - op3%4) {
					case 0:
						robot[op1].setDirection(0);
						break;
					case 1:
						robot[op1].setDirection(1);
						break;
					case 2:
						robot[op1].setDirection(2);
						break;
					case 3:
						robot[op1].setDirection(3);
						break;
					}
					break;
				case "R":
					switch (robot[op1].getDirection() + op3%4 < 0 ? robot[op1].getDirection() + op3%4 + 4 : robot[op1].getDirection() + op3%4) {
					case 0:
						robot[op1].setDirection(0);
						break;
					case 1:
						robot[op1].setDirection(1);
						break;
					case 2:
						robot[op1].setDirection(2);
						break;
					case 3:
						robot[op1].setDirection(3);
						break;
					}
					break;
				}
			}
		} catch (Exception e) {
			ok = false;
		}
		if (ok)
			System.out.println("OK");
		else
			System.out.println(result.get(0));

	}
}

class robotObj {
	int x = 0;
	int y = 0;
	int direction = 0;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
}
