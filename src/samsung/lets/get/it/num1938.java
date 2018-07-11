package samsung.lets.get.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//통나무 옮기기
public class num1938 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] square = new String[N][N];

		int[] x = new int[3];
		int[] y = new int[3];
		int c = 0;
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				square[i][j] = Character.toString(line.charAt(j));
				if (Character.toString(line.charAt(j)).equals("B")) {
					x[c] = i;
					y[c] = j;
					c++;
				}
			}
		}
		
		ArrayList<logClass> loglist = new ArrayList();
		ArrayList<logClass> loglist2 = new ArrayList();
		logClass logObj = null;
		logObj = new logClass();
		logObj.setX(x[1]);
		logObj.setY(y[1]);
		if (x[1] - 1 == x[0])
			logObj.setHorizen(false);
		loglist.add(logObj);
		int count = 0;
		String cm=""; 
		boolean escape = false;
		int tmp_x,tmp_y;
		boolean tmp_horizen=true;
		String tmp_command;
		boolean check3 = true;
		try {
			while (true) {
				count++;
				int size1 = loglist.size();
				for (int i = 0; i < size1; i++) {
					
					// U
					tmp_x = loglist.get(i).getX();
					tmp_y = loglist.get(i).getY();
					tmp_command = loglist.get(i).getCommand();
					tmp_horizen = loglist.get(i).isHorizen();
					check3 = true;
					if (!tmp_command.equals("D")) {
						logObj = new logClass();
						logObj.setCommand("U");
						logObj.setX(tmp_x - 1);
						logObj.setY(tmp_y);
						logObj.setHorizen(tmp_horizen);
						for(int j=loglist2.size()-1; 0<=j; j--) {
							if(loglist2.get(j).getX()==logObj.getX()&&loglist2.get(j).getY()==logObj.getY()&&loglist2.get(j).isHorizen()==logObj.isHorizen()) {
								check3 = false;
								break;
							}
						}
						if(check3) {
							if (check(logObj.getX(), logObj.getY(), logObj.isHorizen(), square, "U")) {
								if (check2(logObj.getX(), logObj.getY(), logObj.isHorizen(), square)) {
									escape = true;
								}
								loglist.add(logObj);
								loglist2.add(logObj);
							}
						}
					}
					check3 = true;
					// D
					if (!tmp_command.equals("U")) {
						logObj = new logClass();
						logObj.setCommand("D");
						logObj.setX(tmp_x + 1);
						logObj.setY(tmp_y);
						logObj.setHorizen(tmp_horizen);
						for(int j=loglist2.size()-1; 0<=j; j--) {
							if(loglist2.get(j).getX()==logObj.getX()&&loglist2.get(j).getY()==logObj.getY()&&loglist2.get(j).isHorizen()==logObj.isHorizen()) {
								check3 = false;
								break;
							}
						}
						if(check3) {
							if (check(logObj.getX(), logObj.getY(), logObj.isHorizen(), square, "D")) {
								if (check2(logObj.getX(), logObj.getY(), logObj.isHorizen(), square)) {
									escape = true;
								}
								loglist.add(logObj);
								loglist2.add(logObj);
							}
						}
					}
					check3 = true;
					// L
					if (!tmp_command.equals("R")) {

						logObj = new logClass();
						logObj.setCommand("L");
						logObj.setY(tmp_y - 1);
						logObj.setX(tmp_x);
						logObj.setHorizen(tmp_horizen);
						for(int j=loglist2.size()-1; 0<=j; j--) {
							if(loglist2.get(j).getX()==logObj.getX()&&loglist2.get(j).getY()==logObj.getY()&&loglist2.get(j).isHorizen()==logObj.isHorizen()) {
								check3 = false;
								break;
							}
						}
						if(check3) {
							if (check(logObj.getX(), logObj.getY(), logObj.isHorizen(), square, "L")) {
								if (check2(logObj.getX(), logObj.getY(), logObj.isHorizen(), square)) {
									escape = true;
								}
								loglist.add(logObj);
								loglist2.add(logObj);
							}
						}
					}
					check3 = true;
					// R
					if (!tmp_command.equals("L")) {

						logObj = new logClass();
						logObj.setCommand("R");
						logObj.setY(tmp_y + 1);
						logObj.setX(tmp_x);
						logObj.setHorizen(tmp_horizen);
						for(int j=loglist2.size()-1; 0<=j; j--) {
							if(loglist2.get(j).getX()==logObj.getX()&&loglist2.get(j).getY()==logObj.getY()&&loglist2.get(j).isHorizen()==logObj.isHorizen()) {
								check3 = false;
								break;
							}
						}
						if(check3) {
							if (check(logObj.getX(), logObj.getY(), logObj.isHorizen(), square, "R")) {
								if (check2(logObj.getX(), logObj.getY(), logObj.isHorizen(), square)) {
									escape = true;
								}
								loglist.add(logObj);
								loglist2.add(logObj);
							}
						}
					}
					check3 = true;
					// T
					if (!tmp_command.equals("T")) {

						logObj = new logClass();
						logObj.setCommand("T");
						logObj.setY(tmp_y);
						logObj.setX(tmp_x);
						logObj.setHorizen(!tmp_horizen);
						for(int j=loglist2.size()-1; 0<=j; j--) {
							if(loglist2.get(j).getX()==logObj.getX()&&loglist2.get(j).getY()==logObj.getY()&&loglist2.get(j).isHorizen()==logObj.isHorizen()) {
								check3 = false;
								break;
							}
						}
						if(check3) {
							if (check(logObj.getX(), logObj.getY(), logObj.isHorizen(), square, "T")) {
								if (check2(logObj.getX(), logObj.getY(), logObj.isHorizen(), square)) {
									escape = true;
								}
								loglist.add(logObj);
								loglist2.add(logObj);
							}
						}
					}
				}
				if (escape) {
					break;
				}
				// 이전 객체 삭제
				for (int i = 0; i < size1; i++) {
					loglist.remove(0);
				}

				if (loglist.size() == 0) {
					count = 0;
					break;
				}

			}
			System.out.println(count);
		} catch (Exception e) {

		}

	}

	public static boolean check(int x, int y, boolean horizen, String[][] square, String command) {
		try {
			if (command.equals("T")) {
				if (square[x - 1][y - 1].equals("1") || square[x - 1][y].equals("1") || square[x - 1][y + 1].equals("1")
						|| square[x + 1][y - 1].equals("1") || square[x + 1][y].equals("1")
						|| square[x + 1][y + 1].equals("1")|| square[x][y - 1].equals("1")|| square[x][y + 1].equals("1"))
					return false;
			} else {
				if (horizen) {
					if (square[x][y - 1].equals("1") || square[x][y].equals("1") || square[x][y + 1].equals("1"))
						return false;
				} else {
					if (square[x - 1][y].equals("1") || square[x][y].equals("1") || square[x + 1][y].equals("1"))
						return false;
				}
			}

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean check2(int x, int y, boolean horizen, String[][] square) throws Exception {
		if (horizen) {
			if (square[x][y - 1].equals("E") && square[x][y].equals("E") && square[x][y + 1].equals("E")) {
				return true;
			}
		} else {
			if (square[x - 1][y].equals("E") && square[x][y].equals("E") && square[x + 1][y].equals("E"))
				return true;
		}
		return false;
	}
		
		

}

class logClass {
	String command = "";
	boolean horizen = true;
	int x, y;

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public boolean isHorizen() {
		return horizen;
	}

	public void setHorizen(boolean horizen) {
		this.horizen = horizen;
	}

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

}
