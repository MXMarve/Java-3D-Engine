import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Texture {
	public int[] pixels;
	private String loc;
	public final int SIZE;
public Texture(String location, int size) {
	loc = location;
	SIZE = size;
	pixels = new int[SIZE * SIZE];
	load();
}
private void load() {
	try {
		BufferedImage image = ImageIO.read(new File(loc));
		int w = image.getWidth();
		int h = image.getHeight();
		image.getRGB(0, 0, w, h, pixels, 0, w);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public static Texture oak_wood = new Texture("res/oakwood.png", 128);
public static Texture oak_log = new Texture("res/oaklog.png", 128);
public static Texture stone = new Texture("res/stone.png", 128);
public static Texture dirt = new Texture("res/dirt.png", 128);
public static Texture grass = new Texture("res/grass.png", 128);
public ArrayList<Texture> textures;
textures = new ArrayList<Texture>();
textures.add(Texture.oak_wood);
textures.add(Texture.oak_log);
textures.add(Texture.dirt);
textures.add(Texture.grass);
textures.add(Texture.stone);