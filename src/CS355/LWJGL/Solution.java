package CS355.LWJGL;

public class Solution implements CS355LWJGLController {

	@Override
	public void render() {
		//matrixMode(GL_PRojectionMatrix)
		//loadIdentity
		//rotate
		//translate
		
		//glOrtho vs gluPerspective

	}

	@Override
	public void resizeGL() {
		//Initialize ModelView
		//Initialize Projection

	}

	@Override
	public void update() {
		//update data as needed
	}

	@Override
	public void updateKeyboard() {
		//poll keyboard
			//if movement, update x,y,z
			//if turn, update rotation
			//if o or p, update mode

	}

}
