DwarfPlanet	"Jim/Lercurnis A I"
{
	ParentBody     "Fragmunt"
	Class          "Aquaria"
	Mass            0.000167
	Radius          440
	InertiaMoment   0.399
	RotationPeriod  90.4
	RotationEpoch   1451545
	Obliquity       -47.4
	EqAscendNode    3.67

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.745
		Randomize      (-0.527, -0.943, 0.592)
		colorDistMagn   0.0781
		colorDistFreq   52
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.132
		snowLevel       2
		tropicLatitude  0.736
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.135
		heightTempGrad  0.625
		beachWidth      0.00122
		tropicWidth     0.07
		mainFreq        1.92
		venusFreq       1.19
		venusMagn       0
		mareFreq        0
		mareDensity     0.117
		terraceProb     0.199
		erosion         0
		montesMagn      0.0577
		montesFreq      20
		montesSpiky     0.98
		montesFraction  0.915
		dunesMagn       0.0317
		dunesFreq       3.87
		dunesFraction   0.09
		hillsMagn       0.118
		hillsFreq       52.4
		hillsFraction   0.857
		hills2Fraction  0.18
		riversMagn      0
		riversFreq      4.03
		riversSin       5.46
		riftsMagn       0
		riftsFreq       3.44
		riftsSin        6.56
		canyonsMagn     0.392
		canyonsFreq     0.18
		canyonsFraction 0
		cracksMagn      0.056
		cracksFreq      0.231
		cracksOctaves   0
		craterMagn      0.615
		craterFreq      1.29
		craterDensity   0.804
		craterOctaves   17
		craterRayedFactor 0.0841
		volcanoMagn     0.157
		volcanoFreq     0.701
		volcanoDensity  0.226
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.171
		volcanoRadius   0.147
		volcanoTemp     227
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.67979793
		SemiMajorAxis   0.692942122
		Eccentricity    0.977099237
		Inclination     -178.625954
		AscendingNode   -178.625954
		ArgOfPericenter -261.068702
		MeanAnomaly     0
	}
}

