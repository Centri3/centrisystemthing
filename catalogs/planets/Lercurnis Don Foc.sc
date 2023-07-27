Moon	"Foc/Lercurnis II I"
{
	ParentBody     "Don"
	Class          "Aquaria"
	Mass            0.0018275
	Radius          1007.8
	InertiaMoment   0.39917
	Oblateness      0.0061099
	Obliquity       4
	EqAscendNode    41.221
	TidalLocked     true

	Albedo          0.7
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial"
		Panspermia true
	}

	Surface
	{
		Preset         "lercurnis_don_foc.cfg"
		SurfStyle       0.12792
		Randomize      (-0.898, 0.822, 0.507)
		colorDistMagn   0.042941
		colorDistFreq   120.14
		detailScale     128
		drivenDarkening 0.16031
		seaLevel        -0.12977
		snowLevel       2
		tropicLatitude  0.37581
		icecapLatitude  2
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32178
		heightTempGrad  0.625
		beachWidth      0.00078457
		tropicWidth     0.07
		mainFreq        1.9074
		venusFreq       1.3558
		venusMagn       1.1069
		mareFreq        0.5
		mareDensity     1
		terraceProb     0.16364
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       0.7
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      45.038
		riversFreq      3.657
		riversSin       4.8852
		riftsMagn       15
		riftsFreq       5.3435
		riftsSin        10
		eqridgeMagn     0.099237
		eqridgeWidth    1
		eqridgeModMagn  1.9084
		eqridgeModFreq  10
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0.1
		cracksFreq      0.2
		cracksOctaves   15
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.35
		volcanoFreq     1.6183
		volcanoDensity  0.17557
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      35
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.77099
		SpotBright      2.5
		SpotWidth       0.05
		SpotBrightCB    2.5
		SpotWidthCB     0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.23101723
		SemiMajorAxisKm 102962.38
		Eccentricity    0.001
		Inclination     4
		AscendingNode   41.221374
		ArgOfPericenter 35.7251908
		MeanAnomaly     101.679389
	}
}

