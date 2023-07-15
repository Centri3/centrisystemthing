Star    "Orp/Atiu"
{
    ParentBody "Orp-Tuoi bar"
    Class      "F4VI"
    MassSol     0.1
    RadSol      0.109
    Temperature 6460
    Lum         0.1
    LumBol      0.1
    Age         2900

	RotationPeriod  48
	Obliquity       50
	EqAscendNode    200

    Surface
    {
		climatePole     0.7
		climateTropic   0.1
		mareFreq        10
		mareDensity     0.01
		hillsMagn       0
		hillsFreq       50
		TempMapMaxTemp  85000
    }

    Atmosphere
    {
        Height      1000
        Bright      20
    }

	Corona
	{
		Radius      3.9975e+05
		Period      0.032615
		Brightness  0.6
		RayDensity  3.4226
		RayCurv     16
	}

    Orbit
    {
        RefPlane        "Equator"
        Period			96.6719931
        SemiMajorAxis   0.523647795211
        Inclination     50
        AscendingNode   200
        ArgOfPericenter	0
        MeanAnomaly     0
    }
}
