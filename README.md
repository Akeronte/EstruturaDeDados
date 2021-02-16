# EstruturaDeDados


	public Integer menor() {
		// TODO Auto-generated method stub
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		int n1 = 940;
		for (int i = 0; i < 8; i = i + 1) {
			if (a[i] < a[i+1]) {
				n1 = a[i];
			}
		}
		
		return n1;
	}
	
	public Integer maior() {
		// TODO Auto-generated method stub
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		int n1 = 940;
		for (int i = 0; i < 8; i = i + 1) {
			if (a[i] > a[i+1]) {
				n1 = a[i];
			}
			if (a[i+1] < n1) {
				n1 = a[i+1];
			}
		}
		
		return n1;
	}

	public Integer soma() {
		// TODO Auto-generated method stub
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		int n1 = 0;
		for (int i = 0; i < 9; i = i + 1) {
			n1 += a[i];
		}
		return n1;
	}
  
	public Integer repeticoes() {
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro para verificar quantas vezes ele existe em nossa lista: ");
		int numb = scan.nextInt();
		int numberone = 0;
		for (int i = 0; i < 9; i = i + i) {
			if (a[i] == numb) {
				numberone += 1;
			}
		}
			
		return numberone;
	}
  
