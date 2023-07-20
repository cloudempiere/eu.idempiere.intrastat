# eu.idempiere.intrastat

This repository provide intrastat implemented which was designed as generic configurable solution, customisable to any country or requirement. 

**Terms**
- **Intrastat Document**. Each intrastat document is recorded for a org/period/country/issotrx, included generated document lines.
- **Intrastat Schema** - define rules for various area/country and process.
- **Custom java class** - used to implemented requirement per EU member countries (we assume how to collect and generate to xml is country specific)
- **Xml document** output generated based on country xsd schema during collect intrastat input documents. This document is reported to governance.
