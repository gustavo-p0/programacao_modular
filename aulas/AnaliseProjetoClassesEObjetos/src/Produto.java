class Produto {
  String description;
  double unitValue;

  /**
   * Registra um produto com descrição e valor unitário
   *
   * @param description Descreve o produto. Min: 2 caracteres.
   * @param unitValue   valor de cada unidade do produto (min: R$ 0.01)
   */
  public void registry(String description, Double unitValue) {
    if (description.length() < 2) {
      this.description = "Sem descrição";
    }
    if (this.unitValue <= 0d) {
      this.unitValue = 0.01;
    }
    this.description = description;
    this.unitValue = unitValue;
  }

  /**
   * Calcula o valor de preço de venda de umm lote de qty produtos, em caso de
   * valor não positivo, retorna 0.
   *
   * @param qty quantidade de produtos a ser vdendido
   * @return Double com o valor do lote, ou valor 0.0 em caso de lote/quantidade
   */
  public double lotValue(int qty) {
    if (qty <= 0d) {
      return 0d;
    }
    return qty * unitValue;
  }
}
