package MyEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class 민아SupplierEx implements Supplier<String>{

	@Override
	public String get() {

		return null;
	}

	public static void main(String[] args) {

		Supplier<String> pasterRecipe = () -> {
			
			String paster = "1. 파스타 면을 끓는 물에 삶는다.\n" +
					"2. 팬에 올리브 오일과 마늘을 넣고 볶는다.\n" +
					"3. 시금치를 넣고 숨이 죽을 때까지 볶는다.\n" +
					"4. 면을 팬에 넣고 굴소스와 소금, 후추를 넣고 볶는다.\n" +
					"5. 파스타를 그릇에 담고 파마산 치즈 가루를 올려서 마무리한다."
					;
			return paster;
		};
		
		String recipe = pasterRecipe.get();
		System.out.println("시금치 알리오 올리오 레시피\n");
		System.out.println(recipe);

	}
}
