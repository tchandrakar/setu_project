package services

object RequestDTOs {
  case class AttributeRequestDTO(attributeName: String, attributeValue: String)
  case class FetchBillRequestDTO(customerIdentifiers: AttributeRequestDTO)


}
