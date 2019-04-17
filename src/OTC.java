public enum OTC {

  /** Opción técnica de Agente de Viajes y Hoteleria */
  AVH,
  /** Opción técnica de Fotoǵrafo, Laboratorista y Prensa */
  FLP,
  /** Opción técnica de Nutriólogo */
  NUT,
  /** Opción técnica de Laboratorista Químico */
  LQ;


  /**
  * Regresa una representación en cadena de las opciones técnicas por si es
  * necesario.
  * @return una representación en cadena de la opción técnica.
  */
  public String toString(){
    switch(this) {
      case AVH:
        return "Agente de Viajes y Hoteleria";
      case FLP:
        return "Fotoǵrafo, Laboratorista y Prensa";
      case NUT:
        return "Nutriólogo";
      case LQ:
        return "Laboratorista Químico";
      default:
        return null;
    }
  }

}
